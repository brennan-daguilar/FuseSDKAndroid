# Fuse Android SDK

## Current Version

Version: 2.7.0

Released: February 10, 2017

## Getting Started

Please review the [integration instructions](https://wiki.fusepowered.com/index.php?title=Android) found here for more information on integrating the Fuse SDK.

## References

* [Integration Instructions](https://wiki.fusepowered.com/index.php?title=Android)
* [Inline Code Reference](http://fusepowered.github.io/FuseSDKAndroid/)
* [Fuse SDK Class Reference](https://wiki.fusepowered.com/docs/Android/classcom_1_1fusepowered_1_1_fuse_s_d_k.html)

## Need an Account?
Please visit [http://www.fusepowered.com](http://www.fusepowered.com) for an account to get started!

## Release Notes

### 2.7.0
February 10, 2017
* Ad network updates
* Optimize cache usage for S2S videos

### 2.6.1
July 7, 2016
* Min API version increased to 15
* Ad provider updates
* Now distributed as AARs
* Deprecated FuseAPI class removed
* Activities and sessions are now tracked automatically
* FuseSDK.startSession() deprecated (to be replaced by FuseSDK.init())
* FuseSDK.pauseSession(), FuseSDK.resumeSession(), and FuseSDK.endSession() deprecated 
* GameDataListener now separated from FuseSDKListener, call FuseSDK.setGameDataListener to register
* FuseSDKListener.adAvailabilityResponse() signature changed.  Now specifies which AdZone the response is for

### 2.5.5
April 1, 2016
* Ad provider updates
* Not an April fools joke

### 2.5.3
March 23, 2016
* Remove in app billing library from jar to avoid conflicts

### 2.5.1
March 9, 2016
* Minor bug fixes

### 2.5.0
February 26, 2016
* Rich media pre and post rolls for cross promotional videos
* Price localization for offers
* Ad provider updates

### 2.4.2
November 25, 2015
* Ad Provider optimizations

### 2.4.0
November 12, 2015
* Ad Provider updates
* VAST Improvements
* Custom End Cards
* Bug Fixes

### 2.3.0
September 30th, 2015
* Custom Offer meta-data
* Custom Call to Action on campaign videos
* Ad provider updates
* Bug fixes
* Android M fixes

### 2.2.2
August 26th, 2015
* Ad provider updates
* Added an adDidShow callback

### 2.2.0
August 7th, 2015
* New ad providers added
* Added VAST support
* Added rewarded video authentication 
  * Added method FuseSDK.setRewardedVideoUserID(String userID) to identify the user
  * The RewardedInfo object now has rewardItemId
* Added startTime and endTime to the IAPOfferInfo object
* Added currencyID, virtualGoodID, startTime and endTime to the VGOfferInfo object
* Fix for game data get/set
* Bug fixes

### 2.1.3
June 11, 2015
* Bug fixes for IAP Offers
* Improve validation for custom events

### 2.1.0
May 28, 2015
* Add custom event
* Improve analytics for rewarded ads
* Add parent consent toggle
* Add new gender Enums
* Bug fixes

### 2.0.5
May 11, 2015
* Bug Fixes

### 2.0.2
April 8th, 2015
* IAP and Virtual Good offers
* Rewarded video enhancements
* Interface updates
* FuseAPI deprecated - please use FuseSDK

## Legal Requirements
By downloading the Fuse Powered SDK, you are granted a limited, non-commercial license to use and review the SDK solely for evaluation purposes.  If you wish to integrate the SDK into any commercial applications, you must register an account with [Fuse Powered](https://www.fusepowered.com) and accept the terms and conditions on the Fuse Powered website.

## Contact Us
For more information, please visit [http://www.fusepowered.com](http://www.fusepowered.com). For questions or assistance, please email us at [support@fusepowered.com](mailto:support@fusepowered.com).
