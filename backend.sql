-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-11-2024 a las 17:57:29
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `backend`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id_p` int(10) NOT NULL,
  `nombre_p` varchar(20) NOT NULL,
  `apellido_p` varchar(20) NOT NULL,
  `id_tp_p` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id_p`, `nombre_p`, `apellido_p`, `id_tp_p`) VALUES
(1, 'carlos', 'pradera', 1),
(2, 'juan', 'toro', 1),
(3, 'pedro', 'torres', 1),
(4, 'teresa', 'pradera', 2),
(6, 'alosnos', 'acosta', 2),
(7, 'carlos', 'pradera', 3),
(8, 'anderson', 'jujutso', 3),
(9, 'goyo', 'tupapi', 3),
(10, 'sharon', 'gonzales', 4),
(11, 'nicolle', 'gonzales', 4),
(12, 'natalia', 'saledo', 4),
(13, 'maria', 'saledo', 5),
(14, 'maria', 'catalan', 5),
(15, 'teresa', 'catalan', 5),
(16, 'nicolle', 'parada', 6),
(17, 'andres', 'parada', 6),
(18, 'arles', 'palermo', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_pr` int(11) NOT NULL,
  `nombre_pr` varchar(20) DEFAULT NULL,
  `tipo_pr` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_pr`, `nombre_pr`, `tipo_pr`) VALUES
(1, 'papa', 'x');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitud`
--

CREATE TABLE `solicitud` (
  `id_s` int(11) NOT NULL,
  `id_pr` int(11) DEFAULT NULL,
  `id_p` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_perosonas`
--

CREATE TABLE `tipo_perosonas` (
  `id_tp` int(10) NOT NULL,
  `nombre_tp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_perosonas`
--

INSERT INTO `tipo_perosonas` (`id_tp`, `nombre_tp`) VALUES
(1, 'Administrativo'),
(2, 'Rector'),
(3, 'Docente'),
(4, 'Estudiante'),
(5, 'conductor-edison'),
(6, 'seguridad'),
(7, 'comercial'),
(8, 'conductor-edison'),
(9, 'conductor-edison'),
(10, 'Ingeniero-Brayam');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_p`),
  ADD KEY `id_tp_p_fk` (`id_tp_p`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_pr`);

--
-- Indices de la tabla `solicitud`
--
ALTER TABLE `solicitud`
  ADD PRIMARY KEY (`id_s`),
  ADD KEY `id_pr` (`id_pr`),
  ADD KEY `id_p` (`id_p`);

--
-- Indices de la tabla `tipo_perosonas`
--
ALTER TABLE `tipo_perosonas`
  ADD PRIMARY KEY (`id_tp`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id_p` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_pr` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tipo_perosonas`
--
ALTER TABLE `tipo_perosonas`
  MODIFY `id_tp` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `id_tp_p_fk` FOREIGN KEY (`id_tp_p`) REFERENCES `tipo_perosonas` (`id_tp`);

--
-- Filtros para la tabla `solicitud`
--
ALTER TABLE `solicitud`
  ADD CONSTRAINT `solicitud_ibfk_1` FOREIGN KEY (`id_pr`) REFERENCES `producto` (`id_pr`),
  ADD CONSTRAINT `solicitud_ibfk_2` FOREIGN KEY (`id_p`) REFERENCES `persona` (`id_p`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
