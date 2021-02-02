import { TestBed } from '@angular/core/testing';

import { EtourService } from './etour.service';

describe('EtourService', () => {
  let service: EtourService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EtourService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
