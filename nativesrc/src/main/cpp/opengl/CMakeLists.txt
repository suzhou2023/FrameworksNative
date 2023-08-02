cmake_minimum_required(VERSION 3.22.1)

project("opengl")

include_directories("${CMAKE_CURRENT_SOURCE_DIR}/include")
include_directories("${CMAKE_CURRENT_SOURCE_DIR}/libs/EGL/include")


file(GLOB_RECURSE SOURCE_FILES "${CMAKE_CURRENT_SOURCE_DIR}/*.cpp")


add_library(
        opengl
        SHARED
        ${SOURCE_FILES}
)
