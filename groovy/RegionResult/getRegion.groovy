/**
 * 获取匹配结果的区域
 *
 * @return 匹配结果的区域
 */
//fun getRegion(): Rect
$console.log($images.matchTemplates("/sdcard/M8Test/opencv/super_mario.jpg", "/sdcard/M8Test/opencv/mario.png", null, null, null, "/sdcard/M8Test/opencv/result_template_mario.jpg", null, null).getBest().getRegion())