package com.jagex.oldscape.pub;

public interface OAuthApi {
   void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

   void setOtlTokenRequester(OtlTokenRequester var1);

   long getAccountHash();

   void setClient(int var1);

   boolean isOnLoginScreen();
}
