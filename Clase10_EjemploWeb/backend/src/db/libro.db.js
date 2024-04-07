const libros = []

contador = 1

const buscar = (data) => {

}

const misLibros=(data)=>{
    console.log('En el serve ',data)
    console.log(libros)
    let librosAutor = libros.filter(libro=>libro.idAutor===data.idAutor)
    return  {
        estado: "Ok",
        mensaje: "Mis libros",
        data: libros.filter(libro=>libro.idAutor===data.idAutor)
    }
}

const registrar = (data) => {
    /* DATOS DE DATA
        nombre
        desc
        idAutor
     */
    console.log(data)
    const existe = libros.find(libro => libro.nombre === data.nombre)
    if(existe) {
        return  {
            estado: "Error",
            mensaje: "Ya existe"
        }
    }

    const libro = {
        nombre: data.nombre,
        desc: data.desc,
        idAutor: data.idAutor,
        id: contador
    }
    contador++

    libros.push(libro)
    console.log(libros)
    return {
        estado: "Ok",
        mensaje: "Registrado"
    }
}

module.exports = {
    libros,
    buscar,
    registrar,
    misLibros
}