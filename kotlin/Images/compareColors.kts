/**
 * 比较[imagePath]图片指定坐标的颜色是否与目标颜色匹配，或比较主坐标及其偏移点的颜色是否匹配。
 *
 * 如果 [colors] 为 null 或空，则仅比较指定坐标 (x, y) 的颜色是否与 [firstColor] 匹配。
 * 如果 [colors] 不为空，则解析颜色偏移字符串，比较主坐标及其偏移点的颜色是否匹配，使用每个偏移点的 similarity。
 *
 * @param imagePath 输入图像的文件路径。
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
//fun compareColors(imagePath: String, firstColor: String, x: Int, y: Int, similarity: Int?, regionBuilder: (Rect.() -> Unit)?, colors: String?, algorithm: String?, ignoreAlpha: Boolean?): Boolean
// (250, 125) 的颜色16进制值为a1adff
// (350, 150) 的颜色16进制值为a1adff, x偏移100,y偏移25, 最后面没有相似度则使用默认的相似度, 100|25|a1adff
// (300, 100) 的颜色16进制值为f6ddc9, x偏移50,y偏移-25, 最后面90表示相似度, 50|-25|f6ddc9|90
_console.log(_images!!.compareColors("/sdcard/M8Test/opencv/super_mario.jpg", "a1adff", 250, 125, null, null, "100|25|a1adff,50|-25|f6ddc9|90", null, null))