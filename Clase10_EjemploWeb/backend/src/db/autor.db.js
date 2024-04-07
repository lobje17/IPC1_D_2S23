const autores = [{
    nombre: 'a',
    correo: 'a',
    password: 'a',
    id: 1
},{
    nombre: 'b',
    correo: 'b',
    password: 'b',
    id: 2
}]
contador = 3

const login = (data) => {
    /* DATOS DE DATA
        nombre
        password
     */
    console.log('Esto llega', data)
    const existe = autores.find(autor => autor.nombre === data.nombre)
    console.log('Esto llega2 ', existe)
    if(existe) {
        if(existe.password == data.password){
            return {
                estado: 'Ok',
                data: existe
            }
        }
        return{
            estado: 'Error',
            mensaje: 'La contraseña no existe'
        }
    }
    
    return {
        estado: 'Error',
        mensaje: 'No existe el autor'
    }
}

const buscar = (data) => {
    const autor = autores.find(autor_ => autor_.nombre === data.nombre)
    return autor
}

const registrar = (data) => {
    /* DATOS DE DATA
        nombre
        correo
        password
        id
     */
    //console.log('Esto es data ', data)
    const existe = autores.some(autor => autor.nombre === data.nombre)
    if(existe) return data

    user = {
        nombre: data.nombre,
        correo: data.correo,
        password: data.password,
        id: contador
    }
    contador++

    //console.log('Esto es data ', data, '\n', contador)
    autores.push(user)
    console.log(autores)
    return user
}

module.exports = {
    autores,
    buscar,
    registrar,
    contador,
    login
}