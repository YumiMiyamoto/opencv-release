'''
/**
 * 获取集合中的所有结果.
 *
 * @return 集合中的所有结果
 */
'''
# fun getAll(): List<T>
_console.log(_images.findColors("/sdcard/M8Test/opencv/super_mario.jpg", "a1adff", 100, None,
                                lambda it: it.set(200, 90, 360, 160), "100|25|a1adff|100,50|-25|f6ddc9|100", None, None,
                                None).getAll())
