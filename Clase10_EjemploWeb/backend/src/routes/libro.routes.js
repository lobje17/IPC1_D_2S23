const express = require('express')
const router = express.Router()

const { buscarLibro, registrarLibro, obtenerLibros, obtenerMisLibros } = require('../controllers/libro.controller')

router.get('/obtener', obtenerLibros)
router.get('/buscar', buscarLibro)
router.post('/registrar', registrarLibro)
router.post('/mislibros', obtenerMisLibros)



module.exports = router