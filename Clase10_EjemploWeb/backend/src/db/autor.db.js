const autores = []

const buscar = (data) => {
    const autor = autores.find(autor_ => autor_.nombre === data.nombre)
    return autor
}

const registrar = (data) => {
    const existe = autores.some(autor => autor.nombre === data.nombre)
    if(existe) return false
    autores.push(data)
    console.log(autores)
    return true
}

module.exports = {
    autores,
    buscar,
    registrar
}