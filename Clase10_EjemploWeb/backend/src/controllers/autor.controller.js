const { buscar, registrar, autores } = require('../db/autor.db')

const obtenerAutores = (req, resp) => {
    resp.status(200).json({
        mensaje: "Ok",
        data: autores
    })
}

const buscarAutor = (req, resp) => {
    const encontrado = buscar(req.body)
    
    if(encontrado){
        resp.status(201).json({
            mensaje: "Ok",
            data: encontrado
        })
    }
    else{
        resp.status(400).json({
            mensaje: "No se encontro en autor"
        })
    }
}

const registrarAutor = (req, resp) => {
    const registrado = registrar(req.body)

    if(registrado){
        resp.status(201).json({
            mensaje: "Se registro correctmente"
        })
    }
    else{
        resp.status(409).json({
            mensaje: "Ya existe un usuario con el mismo nombre"
        })
    }
}

module.exports = {
    obtenerAutores,
    buscarAutor,
    registrarAutor
}