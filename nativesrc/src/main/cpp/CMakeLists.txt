cmake_minimum_required(VERSION 3.22.1)

project("nativesrc")


include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libhardware/include_all")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/system/core/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/system/libbase/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/system/logging/liblog/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/binder/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/binder/ndk/include_ndk")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/binder/ndk/include_platform")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/gui/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/math/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/nativedisplay/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/nativewindow/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/ui/include")


add_subdirectory(libs/gui)
add_subdirectory(libs/nativedisplay)
add_subdirectory(libs/nativewindow)
add_subdirectory(opengl)
