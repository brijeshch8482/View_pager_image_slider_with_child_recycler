# View_pager_image_slider_with_child_recycler
This is View Pager Image Slider Library
![ss1](https://github.com/brijeshch8482/View_pager_image_slider_with_child_recycler/assets/101059187/120cd111-db59-4ec0-913d-8db2d05c6db2)
![ss2](https://github.com/brijeshch8482/View_pager_image_slider_with_child_recycler/assets/101059187/8dd81a64-7278-4e25-8a07-af6a876fc5e3)


https://github.com/brijeshch8482/View_pager_image_slider_with_child_recycler/assets/101059187/e6a32ac9-18ce-4a9a-bcdc-e6fc9067df96



<<<<<<<<<<<   This is the awesome library for showing product your Image slider >>>>>>>>>>>>>>>

->  Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  -> Step 2. Add the dependency
  
  ependencies {
	        implementation 'com.github.brijeshch8482:View_pager_image_slider_with_child_recycler:1.0'
	}
  
  -> In activity_main_layou you need to add View Pager and Recycler View
  -> Use ViewPagerSliderModal for putting image in array lis( ArrayList<ViewPagerSliderModal> viewPagerSliderModalsArrayList = new ArrayList<> ())
  -> Use ViewPagerImageSliderWithChildRecycler  to call Adapters
  
