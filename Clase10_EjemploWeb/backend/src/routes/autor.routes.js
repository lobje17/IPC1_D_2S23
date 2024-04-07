const express = require('express')
const router = express.Router()

const { buscarAutor, registrarAutor, obtenerAutores, loginAutor } = require('../controllers/autor.controller')

router.get('/obtener', obtenerAutores)
router.get('/buscar', buscarAutor)
router.post('/registrar', registrarAutor)
router.post('/login', loginAutor)

module.exports = router