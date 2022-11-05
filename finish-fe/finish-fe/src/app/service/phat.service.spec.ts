import { TestBed } from '@angular/core/testing';

import { PhatService } from './phat.service';

describe('PhatService', () => {
  let service: PhatService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PhatService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
