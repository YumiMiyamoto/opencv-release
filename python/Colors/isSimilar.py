'''
/**
 * 判断 [color1] 和 [color2] 是否相似。
 *
 * @param color1 需要比较的颜色1，支持格式：0x969696、#969696、969696（RGB），或 0xee969696（ARGB）。
 * @param color2 需要比较的颜色2，支持格式：0x969696、#969696、969696（RGB），或 0xee969696（ARGB）。
 * @param similarity 颜色相似度，范围 [0, 100]，0 表示最宽松（允许任何颜色），100 表示最严格（完全匹配）。
 * @param algorithm 匹配算法，支持：equal，diff，rgb，rgb+，hs。
 * @param ignoreAlpha 是否忽略透明度比较，默认为 True（包含透明度比较）。
 * @return 如果两个颜色相似返回True，否则返回False
 */
'''
# fun isSimilar(color1: String, color2: String, similarity: Int?, algorithm: String?, ignoreAlpha: Boolean?): Boolean
_console.log("红色和绿色是否相似", _colors.isSimilar("#ff0000", "#00ff00", None, None, None))
_console.log("红色和红色是否相似", _colors.isSimilar("#ff0000", "#ff0000", None, None, None))
