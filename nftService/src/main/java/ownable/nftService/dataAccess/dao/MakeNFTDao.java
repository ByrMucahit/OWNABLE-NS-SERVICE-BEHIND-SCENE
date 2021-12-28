package ownable.nftService.dataAccess.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ownable.nftService.entities.concretes.MakeNFT;

public interface MakeNFTDao extends JpaRepository<MakeNFT, Integer> {

}
