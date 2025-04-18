/**
 *
 * 从文件路径读取图像进行模板匹配（多目标）, 也就是从 [srcPath] 查找 [templatePath]。
 *
 * @param srcPath 原图像文件路径, 大图
 * @param templatePath 模板图像文件路径, 小图
 * @param similarity 匹配相似度，必须在 [0, 100] 范围内
 * @param regionBuilder 限定仅在原图像的该区域内查找
 * @param outputPath 匹配结果图像输出路径
 * @param method 模板匹配方法
 * @param parallel 是否启用并行处理
 * @return 匹配到的所有结果（按相似度降序），包含匹配区域和相似度
 * @throws IllegalArgumentException 如果 similarity 无效或文件路径无效
 */
//fun matchTemplates(srcPath: String, templatePath: String, similarity: Int?, limit: Int?, regionBuilder: (Rect.() -> Unit)?, outputPath: String?, method: Int?, parallel: Boolean?): Results<RegionResult>
// 模板匹配, 在大图中查找小图并输出结果到指定的路径中
$console.log($images.matchTemplates("/sdcard/M8Test/opencv/super_mario.jpg", "/sdcard/M8Test/opencv/mario.png", null, null, null, "/sdcard/M8Test/opencv/result_template_mario.jpg", null, null))
$console.log($images.matchTemplates("/sdcard/M8Test/opencv/super_mario.jpg", "/sdcard/M8Test/opencv/block.png", null, null, (it) => {
    it.set(220, 129, 240, 150)
}, "/sdcard/M8Test/opencv/result_template_block.jpg", null, null))
