@Autowired
private ProducDataRepository producDataRepository;
@Autowired
private ProducDataMap producDataMap;


@Override
public List<ProducDataDTO> findAllProducDatas() {
    // TODO Auto-generated method stub
    return producDataMap.mappAllProducDatasToProducDatasDTOs(producDataRepository.findProducDatas());
}

public Optional<ProducDataDTO> findProducDataById(Long id){
    Optional<ProducData> oProducData = producDataRepository.findProducDataById(id);
    return Optional.of(producDataMap.mapProducDataToDTO(oProducData.get()));
}

@Override
public ProducDataDTO updateProducData(ProducDataDTO producDataDTO, Long id){
    
    Optional<ProducData> oProducData = producDataRepository.findProducDataById(id);
    if (oProducData.isPresent()) {
        
        if (producDataDTO.getNombre() != null) {
            oProducData.get().setNombre(producDataDTO.getNombre());
        }
        
        if (producDataDTO.getIdPais() != null) {
            oProducData.get().setIdPais(producDataDTO.getIdPais());
        }
        

        return producDataMap.mapProducDataToDTO(producDataRepository.saveProducData(oProducData.get())) ;
    }
    return null;			
}

@Override
public ProducDataDTO deleteProducDataById(Long id) {
    // TODO Auto-generated method stub
    Optional<ProducData> producDataDeleted = producDataRepository.findProducDataById(id);
    if(producDataDeleted.isPresent()) {
        producDataRepository.deleteProducDataById(id);
        return producDataMap.mapProducDataToDTO(producDataDeleted.get());
        }
    return null;
}

@Override
public ProducData saveProducData(ProducData producData) {
    // TODO Auto-generated method stub
    producDataRepository.saveProducData(producData);
    return producData;
}
