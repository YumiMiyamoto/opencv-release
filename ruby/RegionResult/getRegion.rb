# encoding: utf-8
=begin
/**
 * 获取匹配结果的区域
 *
 * @return 匹配结果的区域
 */
=end
# fun getRegion(): Rect
$console.log($images.matchTemplates("/sdcard/M8Test/opencv/super_mario.jpg", "/sdcard/M8Test/opencv/mario.png", nil, nil, nil, "/sdcard/M8Test/opencv/result_template_mario.jpg", nil, nil).getBest().getRegion())