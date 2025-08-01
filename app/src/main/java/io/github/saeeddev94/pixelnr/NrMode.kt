package io.github.saeeddev94.pixelnr

enum class NrMode(
    override val value: String,
    val label: String,
) : NvEnum {
    DISABLED("00", "Disabled"),
    NSA("01", "NSA"),
    SA("10", "SA"),
    SA_NAS("11", "SA+NSA");
}
