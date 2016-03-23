# Fuse Android SDK Core

## Current Version

Version: 2.5.3

Released: March 23, 2016

## To Download
The Fuse "Core" SDK version is a light-weight alternative to the standard Fuse SDK, and includes a pre-bundled version of AdRally optimized for serving video ads (both rewarded and non-rewarded). This SDK is useful for developers who want to keep the final binary size of their apps as small as possible, and also helps developers who are hitting DEX count limits for their Android apps.
The easiest way to obtain the Fuse SDK is to click the "Download ZIP" button located in the right-hand navigation pane of the Github repository page.

## Getting Started

Please review the [integration instructions](https://wiki.fusepowered.com/index.php?title=Android) found here for more information on integrating the Fuse SDK.

## References

* [Integration Instructions](https://wiki.fusepowered.com/index.php?title=Android)
* [Inline Code Reference](http://fusepowered.github.io/FuseSDKAndroid/)
* [Fuse SDK Class Reference](https://wiki.fusepowered.com/docs/Android/classcom_1_1fusepowered_1_1_fuse_s_d_k.html)

## Need an Account?
Please visit [http://www.fusepowered.com](http://www.fusepowered.com) for an account to get started!

## Release Notes

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

### 1.38.0
February 6th, 2015
* Ad provider updates and fixes
* Bug fixes

### 1.37.5
January 13th, 2015
* Ad provider fixes
* New manifest file requirements to properly support ad providers

### 1.37.4
December 23rd, 2014
* Bug fixes
* Ad provider updates

### 1.37.1
November 19th, 2014
* Minor bug fixes for rotation, ad display

### 1.37.0
November 10th, 2014
* 3rd party plugin architecture for mediated networks
* Additional V4VC callbacks
* Bug fixes

## Legal Requirements
By downloading the Fuse Powered SDK, you are granted a limited, non-commercial license to use and review the SDK solely for evaluation purposes.  If you wish to integrate the SDK into any commercial applications, you must register an account with [Fuse Powered](https://www.fusepowered.com) and accept the terms and conditions on the Fuse Powered website.

## Contact Us
For more information, please visit [http://www.fusepowered.com](http://www.fusepowered.com). For questions or assistance, please email us at [support@fusepowered.com](mailto:support@fusepowered.com).
