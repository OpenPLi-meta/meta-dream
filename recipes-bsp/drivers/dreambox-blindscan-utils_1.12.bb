SUMMARY = "Utilities needed to do transponder blindscan with dreambox dvb receivers"
LICENSE = "CLOSED"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES:${PN} += "virtual-blindscan-dvbs virtual-blindscan-dvbc"

DEPENDS = "ncurses"

SRC_URI += "file://blindscan-utils_1.12_mips32el.tar.xz"

S = "${WORKDIR}/blindscan-utils_${PV}_${TUNE_PKGARCH}"

PACKAGES = "${PN}"

do_install() {
	cp -r * ${D}
}

INHIBIT_PACKAGE_STRIP = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

INSANE_SKIP:${PN} = "ldflags already-stripped"
