'''
/**
 * 获取匹配结果的相似度
 *
 * @return 匹配结果的相似度
 */
'''
# fun getSimilarity(): Int
_console.log(_images.findColors("/sdcard/M8Test/opencv/super_mario.jpg", "a1adff", 100, None,
                                lambda it: it.set(200, 90, 360, 160), "100|25|a1adff|100,50|-25|f6ddc9|100", None, None,
                                None).getBest().getSimilarity())
