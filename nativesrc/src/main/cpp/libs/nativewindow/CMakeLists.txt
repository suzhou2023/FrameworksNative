cmake_minimum_required(VERSION 3.22.1)

project("nativewindow")

include_directories("${CMAKE_CURRENT_SOURCE_DIR}/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/include-private")


file(GLOB_RECURSE SOURCE_FILES "${CMAKE_CURRENT_SOURCE_DIR}/*.cpp")


add_library(
        nativewindow
        SHARED
        ${SOURCE_FILES}
)
