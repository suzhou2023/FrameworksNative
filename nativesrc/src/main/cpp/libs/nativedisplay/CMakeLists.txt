cmake_minimum_required(VERSION 3.22.1)

project("nativedisplay")

include_directories("${CMAKE_CURRENT_SOURCE_DIR}/include")



file(GLOB_RECURSE SOURCE_FILES "${CMAKE_CURRENT_SOURCE_DIR}/*.cpp")


add_library(
        nativedisplay
        SHARED
        ${SOURCE_FILES}
)
