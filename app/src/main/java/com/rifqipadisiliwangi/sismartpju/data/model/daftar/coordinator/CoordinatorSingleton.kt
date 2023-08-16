package com.rifqipadisiliwangi.sismartpju.data.model.daftar.coordinator

object CoordinatorSingleton {

    private val idController = arrayOf(
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
        "9758378",
    )

    private val address = arrayOf(
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
        "Jl. Affandi, Depok, Sleman",
    )



    private val idPju = arrayOf(
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
        "12345",
    )




    private val jenisKerusakan = arrayOf(
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
        "Jenis Kerusakan",
    )
    private val alert = arrayOf(
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
        "Lampu Mati",
    )
    private val status = arrayOf(
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
        "Lorem, ipsum, is placeholder,Lorem, ipsum, is placeholder",
    )

    val listPekerjaan: ArrayList<Coordinator>
        get() {
            val list = arrayListOf<Coordinator>()
            for (position in idController.indices){
                val pekerjaan = Coordinator()
                pekerjaan.idController = idController[position]
                pekerjaan.address = address[position]
                pekerjaan.idPju = idPju[position]
                pekerjaan.jenisKerusakan = jenisKerusakan[position]
                pekerjaan.alert = alert[position]
                pekerjaan.status = status[position]
                list.add(pekerjaan)

            }
            return list
        }
}