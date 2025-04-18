# encoding: utf-8
=begin
/**
 * 获取集合中的所有结果.
 *
 * @return 集合中的所有结果
 */
=end
# fun getAll(): List<T>
$console.log($images.findColors("/sdcard/M8Test/opencv/super_mario.jpg", "a1adff", 100, nil, lambda { |it| it.set(200, 90, 360, 160) }, "100|25|a1adff|100,50|-25|f6ddc9|100", nil, nil, nil).getAll())
