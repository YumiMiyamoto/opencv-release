/**
 * 获取匹配结果的相似度
 *
 * @return 匹配结果的相似度
 */
//fun getSimilarity(): Int
$console.log($images.findColors("/sdcard/M8Test/opencv/super_mario.jpg", "a1adff", 100, null, (it) => {
    it.set(200, 90, 360, 160)
}, "100|25|a1adff|100,50|-25|f6ddc9|100", null, null, null).getBest().getSimilarity())
