--[[
/**
 * 获取坐标
 *
 * @return 坐标
 */
]]
--fun getCoordinate(): Point
_console:log(_images                                      :findColors("/sdcard/M8Test/opencv/super_mario.jpg", "a1adff", 100, 100, function(it)
    it:set(200, 90, 360, 160)
end, "100|25|a1adff|100,50|-25|f6ddc9|100", nil, 1, true):getBest():getCoordinate())