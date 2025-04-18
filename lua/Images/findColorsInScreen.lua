--[[
/**
 * 查找屏幕中中匹配的颜色点集合, 会自动申请屏幕截图权限
 *
 * 如果 [colors] 为空，查找匹配主颜色的点；否则查找匹配主颜色及其偏移颜色的点，最多返回 [limit] 个。
 *
 * @param firstColor 目标主颜色，支持格式：0x969696、#969696、969696（RGB）或 0xee969696（ARGB）
 * @param similarity 主颜色的相似度，范围 [0, 100]
 * @param limit 最大返回的匹配点数量
 * @param regionBuilder 查找区域构建函数
 * @param colors 颜色偏移字符串，格式如 "6|1|0x969696|90,1|12|0xee969696|95"
 * @param algorithm 匹配算法，支持：equal、diff、rgb、rgb+、hs
 * @param direction 搜索方向
 * @param ignoreAlpha 是否忽略透明度比较
 * @return 匹配的坐标点及其相似度的集合
 * @throws IllegalArgumentException 如果参数无效
 */
]]
--fun findColorsInScreen(firstColor: String, similarity: Int?, limit: Int?, regionBuilder: (Rect.() -> Unit)?, colors: String?, algorithm: String?, direction: Int?, ignoreAlpha: Boolean?): Results<CoordinateResult>
_console:log(_images:findColorsInScreen("FF111318", 100, 100, function(it)
    it:set(200, 90, 360, 160)
end, "100|25|FF111318|100,50|-25|FF111318|100", nil, 1, true))