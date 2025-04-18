--[[
/**
 * 获取屏幕中的坐标 ([x],[y]) 的颜色16进制, 会自动申请屏幕截图权限
 *
 * @param x 颜色x坐标
 * @param y 颜色y坐标
 * @return 屏幕中的坐标 ([x],[y]) 的颜色16进制，格式为 "#RRGGBB" 或 "#AARRGGBB"（如果包含透明度）
 */
]]
--fun getColorHexInScreen(x: Int, y: Int): String
_threads:sleep(1000)
_console:log("screen", _colors:getColorHexInScreen(250, 125))
_console:log("screen", _colors:getColorHexInScreen(350, 150))
_console:log("screen", _colors:getColorHexInScreen(300, 100))
