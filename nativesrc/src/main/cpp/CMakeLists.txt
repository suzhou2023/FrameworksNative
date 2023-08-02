cmake_minimum_required(VERSION 3.22.1)

project("nativesrc")

include_directories("${CMAKE_CURRENT_SOURCE_DIR}/system_core/libutils/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/binder/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/binder/ndk/include_ndk")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/binder/ndk/include_platform")

add_subdirectory(libs/gui)
add_subdirectory(libs/nativewindow)
