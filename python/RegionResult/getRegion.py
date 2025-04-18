'''
/**
 * 获取匹配结果的区域
 *
 * @return 匹配结果的区域
 */
'''
# fun getRegion(): Rect
_console.log(
    _images.matchTemplates("/sdcard/M8Test/opencv/super_mario.jpg", "/sdcard/M8Test/opencv/mario.png", None, None, None,
                           "/sdcard/M8Test/opencv/result_template_mario.jpg", None, None).getBest().getRegion())
