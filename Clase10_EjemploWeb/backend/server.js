const express = require('express')
const cors = require('cors')

const app = express()
const port = 3000;

app.use(express.json())
app.use(cors())

const autorRoutes = require('./src/routes/autor.routes')
const libroRoutes = require('./src/routes/libro.routes')

app.use('/autores', autorRoutes)
app.use('/libros', libroRoutes)

app.listen(port, ()=>{
    console.log(`Servidor ejecutandose en el puerto ${port}`)
})
// var users = [
//                 { id: 3, nombre: 'S1', password: '11111' },
//                 { id: 2, nombre: 'S2', password: '22222' },
//                 { id: 1, nombre: 'S3', password: '33333' }
//             ]

// app.get('/iniciado', (request, response)=>{
//     response.status(200).json({
//         Mensaje: "La solicitud es correcta en el servidor"
//     })
// })


// app.get('/usuarios', (request, response)=>{
//     response.status(200).json({
//         Mensaje: "La solicitud es correcta en el servidor",
//         data: users
//     })
// })

// app.post('/registro', (request, response)=>{
//     const nuevoUsuario = request.body

//     users.push(nuevoUsuario)
//     console.log(users)
//     response.status(201).json({
//         Mensaje: "El usuario se registro correctamente",
//         Id: users.length-1
//     })
// })

// app.delete('/eliminar/:id', (request, response)=>{
//     const iduser = request.params.id
//     console.log(iduser)

//     users = users.filter((user) => user.id != iduser)

//     console.log('Final ', users)
//     response.status(200).json({
//         Mensaje: "El usuario se elimino correctamente"
//     })
// })


