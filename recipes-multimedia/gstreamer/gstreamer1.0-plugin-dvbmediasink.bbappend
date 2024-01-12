FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append_dm8000 = " \
	file://dmm.patch \
	file://0001-meta-dream-fix-framerate-and-video-size.patch \
	"
