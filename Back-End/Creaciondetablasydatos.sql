CREATE TABLE ProducData (
id SERIAL NOT NULL PRIMARY KEY,
precio int NOT NULL,	
amount int,
nombre varchar(255) NOT NULL,
imagen varchar(255) NOT NULL
);


INSERT INTO "eccommerce".public.ProducData (precio,amount,nombre,imagen ) VALUES
    (98000,0,'Auriculares Plateados','https://res.cloudinary.com/vrilli/image/upload/v1651796663/580b57fbd9996e24bc43bfbb_iax9j6.png'),
    (150000,0,'Auriculares Inalambricos','https://res.cloudinary.com/vrilli/image/upload/v1651796664/580b57fbd9996e24bc43bfbf_np6rhz.png'),
    (85000,0,'Audifonos Sony','https://res.cloudinary.com/vrilli/image/upload/v1651796664/580b57fbd9996e24bc43bfbe_xb8v1p.png'),
    (70000,0,'Auriculares Rojos y Blancos','https://res.cloudinary.com/vrilli/image/upload/v1651796663/580b57fbd9996e24bc43bfbc_mnddru.png'),
    (1600000,0,'Ordenador Portátil HP','https://res.cloudinary.com/vrilli/image/upload/v1651796662/588525296f293bbfae451a34_igg614.png'),
    (1800000,0,'Ordenador Portátil Samsung','https://res.cloudinary.com/vrilli/image/upload/v1651796662/588524c66f293bbfae451a2f_kan5po.png'),
    (2000000,0,'Microsoft Surface Pro 4 Tras','https://res.cloudinary.com/vrilli/image/upload/v1651796663/588526d46f293bbfae451a39_utp5gs.png'),
    (1500000,0,'Amazon Echo','https://res.cloudinary.com/vrilli/image/upload/v1651796664/5871218438315b0eebc1da27_b6ywkv.png'),
    (1800000,0,'Sony Bluetooth BSP60','https://res.cloudinary.com/vrilli/image/upload/v1651796664/587124de38315b0eebc1da28_rqdgup.png'),
    (2300000,0,'Altavoz Google Home Detalle','https://res.cloudinary.com/vrilli/image/upload/v1651796664/5871216238315b0eebc1da23_yq8fck.png'),
    (1500000,0,'Altavoz Sonos','https://res.cloudinary.com/vrilli/image/upload/v1651796664/5871217c38315b0eebc1da26_po6qys.png'),
    (1900000,0,'Google Home Colores','https://res.cloudinary.com/vrilli/image/upload/v1651796663/5871216a38315b0eebc1da24_e7r3f4.png'),
    (1300000,0,'Samsung R7','https://res.cloudinary.com/vrilli/image/upload/v1651796663/5871260a38315b0eebc1da29_leuq7v.png'),
    (2300000,0,'PlaystationPS4','https://res.cloudinary.com/vrilli/image/upload/v1651796662/585ea27bcb11b227491c350b_vxktc3.png'),
    (2600000,0,'Xbox One','https://res.cloudinary.com/vrilli/image/upload/v1651796662/585ea273cb11b227491c350a_hatjnk.png');