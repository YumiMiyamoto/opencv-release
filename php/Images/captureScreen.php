<?php
/**
 * 将屏幕截图保存到 [outputPath] 中
 *
 * @param outputPath 保存路径, 如果该路径文件已存在，那么会删除后在保存到该文件
 */
//fun captureScreen(outputPath: String)
// 截图保存到 /sdcard/M8Test/opencv/screen.jpg, 需要有管理文件权限
$images->captureScreen("/sdcard/M8Test/opencv/screen.jpg");