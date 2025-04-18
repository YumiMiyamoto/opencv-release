/**
 * 判断 [color1] 和 [color2] 是否相似。
 *
 * @param color1 需要比较的颜色1，支持格式：0x969696、#969696、969696（RGB），或 0xee969696（ARGB）。
 * @param color2 需要比较的颜色2，支持格式：0x969696、#969696、969696（RGB），或 0xee969696（ARGB）。
 * @param algorithm 匹配算法，支持：equal，diff，rgb，rgb+，hs。
 * @param ignoreAlpha 是否忽略透明度比较，默认为 true（包含透明度比较）。
 * @return 颜色相似度，范围 [0, 100]，0 表示最宽松（允许任何颜色），100 表示最严格（完全匹配）。
 */
//fun getSimilarity(color1: String, color2: String, algorithm: String?, ignoreAlpha: Boolean?): Int
$console.log($colors.getSimilarity("#ff99ee", "#00ffee", null, true))
$console.log($colors.getSimilarity("#ff99ee", "#00ffee", null, false))
$console.log($colors.getSimilarity("#ff99ee", "#ff99ee", null, true))
$console.log($colors.getSimilarity("#ff99ee", "#ff99ee", null, false))
