const { buscar, registrar, autores, login } = require('../db/autor.db')

const obtenerAutores = (req, resp) => {
    resp.status(200).json({
        mensaje: "Ok",
        data: autores
    })
}



const buscarAutor = (req, resp) => {
    const encontrado = buscar(req.body)
    
    if(encontrado.id==0){
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

const loginAutor = (req, resp) => {
    const encontrado = login(req.body)

    resp.status(200).json(encontrado)
}

const registrarAutor = (req, resp) => {
    const registrado = registrar(req.body)

    if(registrado.id!=0){
        resp.status(201).json({
            estado: 'Ok',
            mensaje: "Se registro correctmente",
            data: registrado
        })
    }
    else{
        resp.status(200).json({
            estado: 'Error',
            mensaje: "Ya existe un usuario con el mismo nombre"
        })
    }
}

module.exports = {
    obtenerAutores,
    buscarAutor,
    registrarAutor,
    loginAutor
}