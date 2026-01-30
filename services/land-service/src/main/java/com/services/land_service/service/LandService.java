package com.services.land_service.service;

import com.services.land_service.dto.*;
import com.services.land_service.entity.Land.LandStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LandService {

    LandResponse createLand(CreateLandRequest request,Long currentUserId);

    LandResponse getLandById(Long id);

    Page<LandSummaryResponse> getAllLands(Pageable pageable);

    LandResponse updateLand(Long id, UpdateLandRequest request);

    LandResponse updateLandStatus(Long id, LandStatus status);

    void deleteLand(Long id);

    Page<LandSummaryResponse> searchLandsByLocation(String province, String district, String sector, Pageable pageable);

    Page<LandSummaryResponse> getLandsByStatus(LandStatus status, Pageable pageable);

    Page<LandSummaryResponse> getLandsByAreaRange(Double minArea, Double maxArea, Pageable pageable);

    LandResponse addImages(Long id, List<String> imageUrls);

    LandResponse addDocuments(Long id, List<String> documentUrls);

    LandResponse removeImage(Long id, String imageUrl);

    LandResponse removeDocument(Long id, String documentUrl);
}