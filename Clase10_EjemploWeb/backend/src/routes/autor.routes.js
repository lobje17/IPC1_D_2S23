const express = require('express')
const router = express.Router()

const { buscarAutor, registrarAutor, obtenerAutores } = require('../controllers/autor.controller')

router.get('/obtener', obtenerAutores)
router.get('/buscar', buscarAutor)
router.post('/registrar', registrarAutor)

module.exports = router