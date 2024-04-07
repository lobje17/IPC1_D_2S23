const { buscar, registrar, misLibros } = require('../db/libro.db')


const obtenerLibros = (req, resp) => {

}


const buscarLibro = (req, resp) => {

}


const registrarLibro = (req, resp) => {
    const registrado = registrar(req.body)

    resp.status(200).json(registrado)
}


const obtenerMisLibros = (req, resp) => {
    const librosAutor = misLibros(req.body)
    
    resp.status(200).json(librosAutor)
}


module.exports = {
    obtenerLibros,
    buscarLibro,
    registrarLibro,
    obtenerMisLibros
}