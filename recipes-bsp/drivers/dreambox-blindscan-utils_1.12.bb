SUMMARY = "Utilities needed to do transponder blindscan with dreambox dvb receivers"
LICENSE = "CLOSED"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES:${PN} += "virtual/blindscan-dvbs virtual/blindscan-dvbc"

DEPENDS = "ncurses"

SRC_URI += "file://blindscan-utils_1.12_mips32el.tar.xz"

S = "${WORKDIR}/blindscan-utils_${PV}_${TUNE_PKGARCH}"

PACKAGES = "${PN}"

SRC_URI[mips32el.md5sum] = "1dd11bc63e8a638f240689e9a00969e4"
SRC_URI[mips32el.sha256sum] = "a87d8b6440c1dab6c7e3e56bdb483f2089185ff55cb64df6321750092b4bd6e0"

do_install() {
	cp -r * ${D}
}

INHIBIT_PACKAGE_STRIP = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"
