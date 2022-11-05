import { TestBed } from '@angular/core/testing';

import { ThuongService } from './thuong.service';

describe('ThuongService', () => {
  let service: ThuongService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ThuongService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
