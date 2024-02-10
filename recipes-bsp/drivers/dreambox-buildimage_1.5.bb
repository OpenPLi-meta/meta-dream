SUMMARY = "create Dreambox NAND boot images"
SECTION = "console/utils"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://src/buildimage.c;endline=17;md5=ea8d8cabec86117939480a328ac3a34b"

PV = "1.5"
PR = "r1"

SRC_URI = "file://buildimage.tar.gz"

S = "${WORKDIR}"

inherit autotools

BBCLASSEXTEND = "native"

OPENDREAMBOX_PROJECT = "buildimage"
