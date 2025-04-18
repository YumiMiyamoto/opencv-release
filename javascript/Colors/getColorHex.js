/**
 * 获取 [image] 中的坐标 ([x],[y]) 的颜色16进制
 *
 * @param image 需要获取颜色的图片路径
 * @param x 颜色x坐标
 * @param y 颜色y坐标
 * @return [image] 中的坐标 ([x],[y]) 的颜色16进制，格式为 "#RRGGBB" 或 "#AARRGGBB"（如果包含透明度）
 */
//fun getColorHex(image: String, x: Int, y: Int): String
// 获取 (250, 125) 的颜色16进制值
$console.log("super_mario.jpg", $colors.getColorHex("/sdcard/M8Test/opencv/super_mario.jpg", 250, 125))
// 获取 (350, 150) 的颜色16进制值
$console.log("super_mario.jpg", $colors.getColorHex("/sdcard/M8Test/opencv/super_mario.jpg", 350, 150))
// 获取 (300, 100) 的颜色16进制值
$console.log("super_mario.jpg", $colors.getColorHex("/sdcard/M8Test/opencv/super_mario.jpg", 300, 100))
