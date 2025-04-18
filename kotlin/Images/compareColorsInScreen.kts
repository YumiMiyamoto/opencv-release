/**
 * 比较屏幕中指定坐标的颜色是否与目标颜色匹配，或比较主坐标及其偏移点的颜色是否匹配, 会自动申请屏幕截图权限。
 *
 * 如果 [colors] 为 null 或空，则仅比较指定坐标 (x, y) 的颜色是否与 [firstColor] 匹配。
 * 如果 [colors] 不为空，则解析颜色偏移字符串，比较主坐标及其偏移点的颜色是否匹配，使用每个偏移点的 similarity。
 *
 * @param firstColor 目标颜色（或主颜色），支持格式：0x969696、#969696、969696（RGB），或 0xee969696（ARGB）。
 * @param x 主坐标的横坐标。
 * @param y 主坐标的纵坐标。
 * @param similarity 颜色相似度（仅用于主颜色），范围 [0, 100]，0 表示最宽松（允许任何颜色），100 表示最严格（完全匹配）。
 * @param regionBuilder 可选参数，指定查找区域（默认全图）。
 * @param colors 颜色偏移字符串，格式如 "6|1|0x969696|90,1|12|0xee969696|95,-4|0|#969696"（可选）。
 * @param algorithm 匹配算法，支持：equal，diff，rgb，rgb+，hs。
 * @param ignoreAlpha 是否忽略透明度比较，默认为 true（包含透明度比较）。
 * @return 是否所有坐标的颜色都匹配，true 表示匹配，false 表示不匹配。
 * @throws IllegalArgumentException 如果 imagePath 无效、similarity 超出范围、algorithm 无效或颜色格式错误。
 */
//fun compareColorsInScreen(firstColor: String, x: Int, y: Int, similarity: Int?, regionBuilder: (Rect.() -> Unit)?, colors: String?, algorithm: String?, ignoreAlpha: Boolean?): Boolean
//#FF111318
_console.log(_images!!.compareColorsInScreen("FF111318", 250, 125, null, null, "100|25|FF111318,50|-25|FF111318|90", null, null))
_console.log(_images!!.compareColorsInScreen("FF111318", 250, 125, null, null, "100|25|FF111318,50|-25|FFE01318|90", null, null))
