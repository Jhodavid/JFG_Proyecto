-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2020 a las 21:07:55
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `jfgdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_cargo`
--

CREATE TABLE `jfg_cargo` (
  `Car_Id` int(11) NOT NULL,
  `Car_Cargo` varchar(25) NOT NULL,
  `Car_Salario` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jfg_cargo`
--

INSERT INTO `jfg_cargo` (`Car_Id`, `Car_Cargo`, `Car_Salario`) VALUES
(1, 'Gerente', '1560000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_cliente`
--

CREATE TABLE `jfg_cliente` (
  `Per_Id` int(11) NOT NULL,
  `TCl_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_contraseñas`
--

CREATE TABLE `jfg_contraseñas` (
  `Cont_Id` int(11) NOT NULL,
  `Cont_Contraseña` varchar(25) NOT NULL,
  `Cont_FechaAsignacion` date NOT NULL,
  `Cont_FechaCambio` date NOT NULL,
  `Emp_Usuario` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_detallefactura`
--

CREATE TABLE `jfg_detallefactura` (
  `DeFa_Cantidad` int(11) NOT NULL,
  `EnFa_Id` int(11) NOT NULL,
  `Inv_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_detallepedido`
--

CREATE TABLE `jfg_detallepedido` (
  `Ped_Id` int(11) NOT NULL,
  `Prod_Id` int(11) NOT NULL,
  `DePe_Cantidad` int(11) NOT NULL,
  `DePe_Precio` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_empleados`
--

CREATE TABLE `jfg_empleados` (
  `Emp_Usuario` varchar(25) NOT NULL,
  `Per_Id` int(11) NOT NULL,
  `Car_Id` int(11) NOT NULL,
  `Emp_FechaContrato` date NOT NULL,
  `Emp_FechaSalida` date NOT NULL,
  `Cont_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_encfactura`
--

CREATE TABLE `jfg_encfactura` (
  `EnFa_Id` int(11) NOT NULL,
  `Enfa_Fecha` date NOT NULL,
  `Empleado_Id` int(11) NOT NULL,
  `Cliente_Id` int(11) NOT NULL,
  `EnFa_Direccion` varchar(20) NOT NULL,
  `EnFa_Municipio` varchar(20) DEFAULT NULL,
  `EnFa_Departamento` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_inventario`
--

CREATE TABLE `jfg_inventario` (
  `Inv_Id` int(11) NOT NULL,
  `Inv_Cantidad` int(11) NOT NULL,
  `Prod_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_pagopedido`
--

CREATE TABLE `jfg_pagopedido` (
  `Pag_Id` int(11) NOT NULL,
  `Ped_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_pagos`
--

CREATE TABLE `jfg_pagos` (
  `Pag_Id` int(11) NOT NULL,
  `Pag_Fecha` date NOT NULL,
  `Pag_Descripcion` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_pagosalario`
--

CREATE TABLE `jfg_pagosalario` (
  `Per_Id` int(11) NOT NULL,
  `Pag_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_pagoservicio`
--

CREATE TABLE `jfg_pagoservicio` (
  `PaSe_Precio` int(11) NOT NULL,
  `Pag_Id` int(11) NOT NULL,
  `TiSe_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_pedido`
--

CREATE TABLE `jfg_pedido` (
  `Ped_Id` int(11) NOT NULL,
  `Ped_Fecha` date NOT NULL,
  `Prov_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_personas`
--

CREATE TABLE `jfg_personas` (
  `Per_Id` int(11) NOT NULL,
  `Per_DNI` varchar(35) NOT NULL,
  `Per_Nombres` varchar(40) NOT NULL,
  `Per_Apellidos` varchar(45) NOT NULL,
  `Per_correos` varchar(40) NOT NULL,
  `TDo_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_precio`
--

CREATE TABLE `jfg_precio` (
  `Prec_Precio` int(11) NOT NULL,
  `Prec_FechaInicio` date NOT NULL,
  `Prec_FechaCambio` date NOT NULL,
  `Prod_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_productos`
--

CREATE TABLE `jfg_productos` (
  `Prod_Id` int(11) NOT NULL,
  `Prod_Nombre` varchar(25) NOT NULL,
  `Prod_Descripcion` varchar(150) NOT NULL,
  `Prod_Estado` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_proveedor`
--

CREATE TABLE `jfg_proveedor` (
  `Prov_Id` int(11) NOT NULL,
  `Prov_Nombre` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_telefonos`
--

CREATE TABLE `jfg_telefonos` (
  `Per_Id` int(11) NOT NULL,
  `Tel_Telefono` decimal(10,0) NOT NULL,
  `Tel_Estado` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_tipocliente`
--

CREATE TABLE `jfg_tipocliente` (
  `TCl_Id` int(11) NOT NULL,
  `TCl_TipoCliente` varchar(15) NOT NULL,
  `TCl_Descuento` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_tipodocumento`
--

CREATE TABLE `jfg_tipodocumento` (
  `TDo_Id` int(11) NOT NULL,
  `TDo_TipoDocumento` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jfg_tiposervicio`
--

CREATE TABLE `jfg_tiposervicio` (
  `TiSe_Id` int(11) NOT NULL,
  `TiSe_TipoServicio` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `jfg_cargo`
--
ALTER TABLE `jfg_cargo`
  ADD PRIMARY KEY (`Car_Id`);

--
-- Indices de la tabla `jfg_cliente`
--
ALTER TABLE `jfg_cliente`
  ADD KEY `Cliente_Id_TipCliente_fk` (`TCl_Id`),
  ADD KEY `Cliente_Id_Personas_fk` (`Per_Id`);

--
-- Indices de la tabla `jfg_contraseñas`
--
ALTER TABLE `jfg_contraseñas`
  ADD PRIMARY KEY (`Cont_Id`),
  ADD KEY `Contraseña_Id_Empleados_fk` (`Emp_Usuario`);

--
-- Indices de la tabla `jfg_detallefactura`
--
ALTER TABLE `jfg_detallefactura`
  ADD KEY `DetalleFactura_Id_Inventario_fk` (`Inv_Id`),
  ADD KEY `DetalleFactura_Id_EncFactura_fk` (`EnFa_Id`);

--
-- Indices de la tabla `jfg_detallepedido`
--
ALTER TABLE `jfg_detallepedido`
  ADD KEY `DetallePedido_Id_Pedido_fk` (`Ped_Id`),
  ADD KEY `DetallePedido_Id_Productos_fk` (`Prod_Id`);

--
-- Indices de la tabla `jfg_empleados`
--
ALTER TABLE `jfg_empleados`
  ADD PRIMARY KEY (`Emp_Usuario`),
  ADD KEY `Empleados_Id_Cargo_fk` (`Car_Id`),
  ADD KEY `Empleados_Id_Personas_fk` (`Per_Id`),
  ADD KEY `Empleados_Id_Contraseñas_fk` (`Cont_Id`);

--
-- Indices de la tabla `jfg_encfactura`
--
ALTER TABLE `jfg_encfactura`
  ADD PRIMARY KEY (`EnFa_Id`),
  ADD KEY `EncFactura_Id_Personas_Cliente_fk` (`Cliente_Id`),
  ADD KEY `EncFactura_Id_Personas_Empleado_fk` (`Empleado_Id`);

--
-- Indices de la tabla `jfg_inventario`
--
ALTER TABLE `jfg_inventario`
  ADD PRIMARY KEY (`Inv_Id`),
  ADD KEY `Inventario_Id_Productos_fk` (`Prod_Id`);

--
-- Indices de la tabla `jfg_pagopedido`
--
ALTER TABLE `jfg_pagopedido`
  ADD KEY `PagoPedido_Id_Pedido_fk` (`Ped_Id`),
  ADD KEY `PagoPedido_Id_Pagos_fk` (`Pag_Id`);

--
-- Indices de la tabla `jfg_pagos`
--
ALTER TABLE `jfg_pagos`
  ADD PRIMARY KEY (`Pag_Id`);

--
-- Indices de la tabla `jfg_pagosalario`
--
ALTER TABLE `jfg_pagosalario`
  ADD KEY `PagoSalario_Id_Pagos_fk` (`Pag_Id`),
  ADD KEY `PagoSalario_Id_Personas_fk` (`Per_Id`);

--
-- Indices de la tabla `jfg_pagoservicio`
--
ALTER TABLE `jfg_pagoservicio`
  ADD KEY `PagoPedido_Id_TipoServicio_fk` (`TiSe_Id`),
  ADD KEY `PagoServicio_Id_Pagos_fk` (`Pag_Id`);

--
-- Indices de la tabla `jfg_pedido`
--
ALTER TABLE `jfg_pedido`
  ADD PRIMARY KEY (`Ped_Id`),
  ADD KEY `Pedido_Id_Proveedor_fk` (`Prov_Id`);

--
-- Indices de la tabla `jfg_personas`
--
ALTER TABLE `jfg_personas`
  ADD PRIMARY KEY (`Per_Id`),
  ADD KEY `Personas_Id_TipDocumento_fk` (`TDo_Id`);

--
-- Indices de la tabla `jfg_precio`
--
ALTER TABLE `jfg_precio`
  ADD KEY `Precio_Id_Productos_fk` (`Prod_Id`);

--
-- Indices de la tabla `jfg_productos`
--
ALTER TABLE `jfg_productos`
  ADD PRIMARY KEY (`Prod_Id`);

--
-- Indices de la tabla `jfg_proveedor`
--
ALTER TABLE `jfg_proveedor`
  ADD PRIMARY KEY (`Prov_Id`);

--
-- Indices de la tabla `jfg_telefonos`
--
ALTER TABLE `jfg_telefonos`
  ADD KEY `Telefonos_Id_Personas_fk` (`Per_Id`);

--
-- Indices de la tabla `jfg_tipocliente`
--
ALTER TABLE `jfg_tipocliente`
  ADD PRIMARY KEY (`TCl_Id`);

--
-- Indices de la tabla `jfg_tipodocumento`
--
ALTER TABLE `jfg_tipodocumento`
  ADD PRIMARY KEY (`TDo_Id`);

--
-- Indices de la tabla `jfg_tiposervicio`
--
ALTER TABLE `jfg_tiposervicio`
  ADD PRIMARY KEY (`TiSe_Id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `jfg_cliente`
--
ALTER TABLE `jfg_cliente`
  ADD CONSTRAINT `Cliente_Id_Personas_fk` FOREIGN KEY (`Per_Id`) REFERENCES `jfg_personas` (`Per_Id`),
  ADD CONSTRAINT `Cliente_Id_TipCliente_fk` FOREIGN KEY (`TCl_Id`) REFERENCES `jfg_tipocliente` (`TCl_Id`);

--
-- Filtros para la tabla `jfg_contraseñas`
--
ALTER TABLE `jfg_contraseñas`
  ADD CONSTRAINT `Contraseña_Id_Empleados_fk` FOREIGN KEY (`Emp_Usuario`) REFERENCES `jfg_empleados` (`Emp_Usuario`);

--
-- Filtros para la tabla `jfg_detallefactura`
--
ALTER TABLE `jfg_detallefactura`
  ADD CONSTRAINT `DetalleFactura_Id_EncFactura_fk` FOREIGN KEY (`EnFa_Id`) REFERENCES `jfg_encfactura` (`EnFa_Id`),
  ADD CONSTRAINT `DetalleFactura_Id_Inventario_fk` FOREIGN KEY (`Inv_Id`) REFERENCES `jfg_inventario` (`Inv_Id`);

--
-- Filtros para la tabla `jfg_detallepedido`
--
ALTER TABLE `jfg_detallepedido`
  ADD CONSTRAINT `DetallePedido_Id_Pedido_fk` FOREIGN KEY (`Ped_Id`) REFERENCES `jfg_pedido` (`Ped_Id`),
  ADD CONSTRAINT `DetallePedido_Id_Productos_fk` FOREIGN KEY (`Prod_Id`) REFERENCES `jfg_productos` (`Prod_Id`);

--
-- Filtros para la tabla `jfg_empleados`
--
ALTER TABLE `jfg_empleados`
  ADD CONSTRAINT `Empleados_Id_Cargo_fk` FOREIGN KEY (`Car_Id`) REFERENCES `jfg_cargo` (`Car_Id`),
  ADD CONSTRAINT `Empleados_Id_Contraseñas_fk` FOREIGN KEY (`Cont_Id`) REFERENCES `jfg_contraseñas` (`Cont_Id`),
  ADD CONSTRAINT `Empleados_Id_Personas_fk` FOREIGN KEY (`Per_Id`) REFERENCES `jfg_personas` (`Per_Id`);

--
-- Filtros para la tabla `jfg_encfactura`
--
ALTER TABLE `jfg_encfactura`
  ADD CONSTRAINT `EncFactura_Id_Personas_Cliente_fk` FOREIGN KEY (`Cliente_Id`) REFERENCES `jfg_personas` (`Per_Id`),
  ADD CONSTRAINT `EncFactura_Id_Personas_Empleado_fk` FOREIGN KEY (`Empleado_Id`) REFERENCES `jfg_personas` (`Per_Id`);

--
-- Filtros para la tabla `jfg_inventario`
--
ALTER TABLE `jfg_inventario`
  ADD CONSTRAINT `Inventario_Id_Productos_fk` FOREIGN KEY (`Prod_Id`) REFERENCES `jfg_productos` (`Prod_Id`);

--
-- Filtros para la tabla `jfg_pagopedido`
--
ALTER TABLE `jfg_pagopedido`
  ADD CONSTRAINT `PagoPedido_Id_Pagos_fk` FOREIGN KEY (`Pag_Id`) REFERENCES `jfg_pagos` (`Pag_Id`),
  ADD CONSTRAINT `PagoPedido_Id_Pedido_fk` FOREIGN KEY (`Ped_Id`) REFERENCES `jfg_pedido` (`Ped_Id`);

--
-- Filtros para la tabla `jfg_pagosalario`
--
ALTER TABLE `jfg_pagosalario`
  ADD CONSTRAINT `PagoSalario_Id_Pagos_fk` FOREIGN KEY (`Pag_Id`) REFERENCES `jfg_pagos` (`Pag_Id`),
  ADD CONSTRAINT `PagoSalario_Id_Personas_fk` FOREIGN KEY (`Per_Id`) REFERENCES `jfg_personas` (`Per_Id`);

--
-- Filtros para la tabla `jfg_pagoservicio`
--
ALTER TABLE `jfg_pagoservicio`
  ADD CONSTRAINT `PagoPedido_Id_TipoServicio_fk` FOREIGN KEY (`TiSe_Id`) REFERENCES `jfg_tiposervicio` (`TiSe_Id`),
  ADD CONSTRAINT `PagoServicio_Id_Pagos_fk` FOREIGN KEY (`Pag_Id`) REFERENCES `jfg_pagos` (`Pag_Id`);

--
-- Filtros para la tabla `jfg_pedido`
--
ALTER TABLE `jfg_pedido`
  ADD CONSTRAINT `Pedido_Id_Proveedor_fk` FOREIGN KEY (`Prov_Id`) REFERENCES `jfg_proveedor` (`Prov_Id`);

--
-- Filtros para la tabla `jfg_personas`
--
ALTER TABLE `jfg_personas`
  ADD CONSTRAINT `Personas_Id_TipDocumento_fk` FOREIGN KEY (`TDo_Id`) REFERENCES `jfg_tipodocumento` (`TDo_Id`);

--
-- Filtros para la tabla `jfg_precio`
--
ALTER TABLE `jfg_precio`
  ADD CONSTRAINT `Precio_Id_Productos_fk` FOREIGN KEY (`Prod_Id`) REFERENCES `jfg_productos` (`Prod_Id`);

--
-- Filtros para la tabla `jfg_telefonos`
--
ALTER TABLE `jfg_telefonos`
  ADD CONSTRAINT `Telefonos_Id_Personas_fk` FOREIGN KEY (`Per_Id`) REFERENCES `jfg_personas` (`Per_Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
