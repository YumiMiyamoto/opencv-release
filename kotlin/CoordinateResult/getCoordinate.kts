/**
 * 获取坐标
 *
 * @return 坐标
 */
//fun getCoordinate(): Point
_console.log(_images!!.findColors("/sdcard/M8Test/opencv/super_mario.jpg", "a1adff", 100, null, { set(200, 90, 360, 160) }, "100|25|a1adff|100,50|-25|f6ddc9|100", null, null, null).getBest()?.getCoordinate())