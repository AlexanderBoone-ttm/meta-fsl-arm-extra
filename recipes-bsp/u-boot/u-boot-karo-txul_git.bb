require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "U-Boot for Ka-Ro electronics TX6UL Computer-On-Modules."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

PROVIDES = "u-boot"

PV = "v2015.10-rc2+git${SRCPV}"

SRCREV = "e1be59fc1a959a917749ecf24834acdc6e2d70e7"
SRCBRANCH = "karo-tx6"
SRC_URI = "git://git.karo-electronics.de/karo-tx-uboot.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE  = "(tx6ul-.*)"
