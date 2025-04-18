# encoding: utf-8
=begin
/**
 * 将屏幕裁剪一个矩形区域保存到 [outputPath] 中, 会自动申请屏幕截图权限
 * @param outputPath 保存路径, 如果该路径文件已存在，那么会删除后在保存到该文件
 * @param regionBuilder 构建矩形的函数
 * @receiver 待构建的矩形对象
 */
=end
# fun cropInScreen(outputPath: String, regionBuilder: Rect.() -> Unit)
# 截取屏幕左上角 (100,100) 到右下角 (300, 200) 矩形区域的保存到 /sdcard/M8Test/opencv/crop_screen.jpg
$images.cropInScreen("/sdcard/M8Test/opencv/crop_screen.jpg", lambda { |it| it.set(100, 100, 300, 200) })
